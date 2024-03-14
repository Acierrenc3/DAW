import React from "react";
import { useTranslation } from "react-i18next";

export const Contacto = () => {
  const { t } = useTranslation();
  return (
    <div id="contenedor-padre">
      <h1>{t("titleContact")}</h1>
      <form id="form-contacto">
        <div>
          <label for="nombre">{t("formName")}</label>
          <input type="text" id="nombre" name="nombre" />
        </div>
        <div>
          <label for="email">{t("formEmail")}</label>
          <input type="email" id="email" name="email" />
        </div>
        <div>
          <label for="mensaje">{t("formMsg")}</label>
          <textarea id="mensaje" name="mensaje"></textarea>
        </div>
        <button type="submit">{t("formSubmit")}</button>
      </form>
    </div>
  );
};

export default Contacto;
