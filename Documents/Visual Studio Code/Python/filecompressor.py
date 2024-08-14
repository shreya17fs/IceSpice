from PIL import Image
import fitz  # PyMuPDF
import io
import os

def compress_image(input_path, output_path, quality=85):
    """Compress an image and save it."""
    image = Image.open(input_path)
    image.save(output_path, quality=quality, optimize=True)

def compress_pdf(input_path, output_path, dpi=72):
    """Compress a PDF file."""
    document = fitz.open(input_path)
    output = fitz.open()
    
    for page_number in range(document.page_count):
        page = document.load_page(page_number)
        pix = page.get_pixmap(dpi=dpi)
        img = Image.open(io.BytesIO(pix.tobytes()))
        img_byte_array = io.BytesIO()
        img.save(img_byte_array, format='JPEG', quality=75)
        img_compressed = Image.open(img_byte_array)
        
        output.new_page(width=page.rect.width, height=page.rect.height)
        output[-1].insert_image(page.rect, stream=img_byte_array.getvalue())
    
    output.save(output_path)

# Example usage
compress_image('input.jpg', 'output.jpg')
compress_pdf('input.pdf', 'output.pdf')
