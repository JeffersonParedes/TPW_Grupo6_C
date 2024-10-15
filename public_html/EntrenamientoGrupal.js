let currentSlide = 0;

function showSlides() {
    const slides = document.getElementsByClassName("carousel-item");
    for (let i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";  
    }
    currentSlide++;
    if (currentSlide > slides.length) { currentSlide = 1 }    
    slides[currentSlide - 1].style.display = "block";  
}

function changeSlide(n) {
    const slides = document.getElementsByClassName("carousel-item");
    slides[currentSlide - 1].style.display = "none";  
    currentSlide += n;
    if (currentSlide > slides.length) { currentSlide = 1 }
    if (currentSlide < 1) { currentSlide = slides.length }
    slides[currentSlide - 1].style.display = "block";  
}

// Inicializar el carrusel
showSlides();
setInterval(showSlides, 5000); // Cambiar cada 5 segundos