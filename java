document.getElementById('toggle-btn').addEventListener('click', function(event) {
    event.preventDefault();
    const extraText = document.querySelector('.extra-text');
    if (extraText.style.display === 'none' || extraText.style.display === '') {
        extraText.style.display = 'block';
        event.target.innerText = 'Leia Menos';
    } else {
        extraText.style.display = 'none';
        event.target.innerText = 'Leia Mais';
    }
});
