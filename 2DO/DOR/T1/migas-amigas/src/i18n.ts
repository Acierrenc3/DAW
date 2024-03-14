import i18n from "i18next";
import { initReactI18next } from "react-i18next";
i18n.use(initReactI18next).init({
  lng: "es",
  fallbackLng: "es",
  interpolation: {
    escapeValue: false,
  },
  resources: {
    pt: {
      translation: {
        titleHeader: "Cabeçalho e barra de navegação",
        titleFooter: "Tarte de pagina",
        titleBody: "Esta é a página inicial",
        titleBodyError: "ERRO 404 PÁGINA NÃO ENCONTRADA",
        titleBodyPasBollo: "Esta é a página da pastelaria e da padaria.",
        titleBodyPan: "Esta é a página da padaria",
        titleBodyEmpanada: "Esta é a página das empanadas",
        titleBodyContacto: "Esta é a página de contacto",
      },
    },
    es: {
      translation: {
        titleHeader: "Cabecera y barra de navegacion",
        titleFooter: "Pie de página",
        titleBody: "Esta es la página inicio",
        titleBodyError: "ERROR 404 PAGINA NO ENCONTRADA",
        titleBodyPasBollo: "Esta es la página de pastelería y bollería",
        titleBodyPan: "Esta es la página de panadería",
        titleBodyEmpanada: "Esta es la página de empanadas",
        titleBodyContacto: "Esta es la página de contacto",
      },
    },
  },
});
export default i18n;
