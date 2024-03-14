import React from "react";
import { useTranslation } from "react-i18next";
import { LANGUAGES } from "../../constants/langs.ts";

const HeaderNav = () => {
  const { i18n, t } = useTranslation();

  const onChangeLang = (event) => {
    const newLang = event.target.value;
    i18n.changeLanguage(newLang);
  };

  return (
    <div>
      <h1>{t("titleHeader")}</h1>
      <nav>
        <a href="/Principal">{t("navHome")}</a>
        <a href="/Proyectos">{t("navProjects")}</a>
        <a href="/Curriculum">{t("navResume")}</a>
        <a href="/Servicios">{t("navServices")}</a>
        <a href="/Contacto">{t("navContact")}</a>
      </nav>
      <select defaultValue={i18n.language} onChange={onChangeLang}>
        {LANGUAGES.map(({ code, label }) => (
          <option key={code} value={code}>
            {label}
          </option>
        ))}
      </select>
    </div>
  );
};

export default HeaderNav;
