function showPopup() {
    document.getElementById('popup').style.display = 'flex';
    document.body.style.overflow = 'hidden'; // Disable scrolling
}

function hidePopup() {
    document.getElementById('popup').style.display = 'none';
    document.body.style.overflow = ''; // Enable scrolling
}

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