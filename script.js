// Function to show the popup and disable scrolling
function showPopup() {
    document.getElementById('popup').style.display = 'flex';
    document.body.style.overflow = 'hidden'; // Disable scrolling
}

// Function to hide the popup and enable scrolling
function hidePopup() {
    document.getElementById('popup').style.display = 'none';
    document.body.style.overflow = ''; // Enable scrolling
}

// Function to show a specific section and also show the popup
function showSection(sectionId) {
    // Hide all sections
    document.querySelectorAll('section').forEach(section => {
        section.style.display = 'none';
    });
    
    // Show the selected section
    const sectionToShow = document.getElementById(sectionId);
    if (sectionToShow) {
        sectionToShow.style.display = 'block';
    }
    
    // Scroll to the top of the section
    sectionToShow.scrollIntoView({ behavior: 'smooth' });

    // Show the popup
    showPopup();
}

// Function to search users based on the search bar input
function searchUsers() {
    const query = document.getElementById('search-bar').value.toLowerCase();
    const cards = document.querySelectorAll('.card');

    cards.forEach(card => {
        const name = card.querySelector('.profile-info strong').textContent.toLowerCase();
        const location = card.querySelector('.profile-info span').textContent.toLowerCase();

        if (name.includes(query) || location.includes(query)) {
            card.style.display = 'flex';
        } else {
            card.style.display = 'none';
        }
    });
}
// Function to redirect to chat.html
function redirectToChat() {
    window.location.href = 'chat.html';
}


// Add event listener for "Jam" link to show the popup
document.addEventListener('DOMContentLoaded', () => {
    const jamLink = document.getElementById('jam-link');
    const closeBtn = document.querySelector('.popup .close-btn');

    jamLink.addEventListener('click', (e) => {
        e.preventDefault(); // Prevent default link behavior
        showPopup(); // Show the popup
    });

    closeBtn.addEventListener('click', () => {
        hidePopup(); // Hide the popup
    });

    // Optional: Close the popup if the user clicks outside of it
    window.addEventListener('click', (e) => {
        if (e.target === document.getElementById('popup')) {
            hidePopup(); // Hide the popup
        }
    });
});

