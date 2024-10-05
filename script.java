// Smooth scroll functionality for navigation
document.querySelectorAll('a.nav-link').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
      e.preventDefault();
  
      document.querySelector(this.getAttribute('href')).scrollIntoView({
        behavior: 'smooth'
      });
    });
  });
  
  // Add scroll animation to elements
  window.addEventListener('scroll', () => {
    const elements = document.querySelectorAll('.scroll-animation');
    const windowHeight = window.innerHeight;
  
    elements.forEach(element => {
      const position = element.getBoundingClientRect().top;
  
      if (position < windowHeight - 100) {
        element.classList.add('visible');
      }
    });
  });
  