import i18n from "i18next";
import { initReactI18next } from "react-i18next";

i18n.use(initReactI18next).init({
  lng: "es",
  fallbackLng: "es",
  interpolation: {
    escapeValue: false,
  },
  resources: {
    en: {
      translation: {
        //T. Header y componentes
        titleHeader: "Header and navigation bar",
        navHome: "Home",
        navProjects: "Projects",
        navResume: "Resume",
        navServices: "Services",
        navContact: "Contact",
        //Principal
        titleMain: "Main Page",
        bodyMain: "Main body text",
        //Error404
        titleError: "Error 404 Page not found",
        //Contacto y formulario
        titleContact: "Contact me",
        formName: "Full Name",
        formEmail: "Email",
        formMsg: "Message",
        formSubmit: "Submit",
        //Curriculum
        titleResume: "My Resume",
        titleH2Resume: "Front End Developer",
        bodyResume: "This is a random paragraph",
        //Proyectos
        titleProjects: "My Projects",
        proyect1Title: "Project 1",
        proyect1Description: "Project 1 Description",
        proyect2Title: "Project 2",
        proyect2Description: "Project 2 Description",
        proyect3Title: "Project 3",
        proyect3Description: "Project 3 Description",
        //Servicio
        titleServices: "My Services",
        titleService1: "Service 1",
        service1Description: "Service 1 Description",
        titleService2: "Service 2",
        service2Description: "Service 2 Description",
        tittleService3: "Service 3",
        service3Description: "Service 3 Description",
        //Footer
        titleFooter: "Footer",
      },
    },
    es: {
      translation: {
        //T. Header y componentes
        titleHeader: "Encabezado y barra de navegacion",
        navHome: "Principal",
        navProjects: "Proyectos",
        navResume: "Curriculum",
        navServices: "Servicios",
        navContact: "Contacto",
        //----------------
        titleMain: "Página principal",
        bodyMain: "Texto pagina principal",
        titleError: "Error 404 Página no encontrada",
        //Contacto y formulario
        titleContact: "Contactame",
        formName: "Nombre Completo",
        formEmail: "Correo electrónico",
        formMsg: "Mensage",
        formSubmit: "Enviar",
        //Curriculum
        titleResume: "Mi Currículum",
        titleH2Resume: "Desarrollador Front End",
        bodyResume: "Este es un párrafo aleatorio",
        //Proyectos
        titleProjects: "Mis Proyectos",
        proyect1Title: "Proyecto 1",
        proyect1Description: "Descripcion proyecto 1",
        proyect2Title: "Proyecto 2",
        proyect2Description: "Descripcion proyecto 2",
        proyect3Title: "Proyecto 3",
        proyect3Description: "Descripcion proyecto 3",
        //Servicios
        titleServices: "Mis Servicios",
        titleService1: "Servicio 1",
        service1Description: "Descripcion del servicio 1",
        titleService2: "Servicio 2",
        service2Description: "Descripcion del servicio 2",
        tittleService3: "Servicio 3",
        service3Description: "Descripcion del servicio 3",
        //Footer
        titleFooter: "Pie de página",
      },
    },
  },
});

export default i18n;
