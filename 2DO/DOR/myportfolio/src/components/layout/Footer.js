import React from "react";
import { useTranslation } from "react-i18next";
import { LANGUAGES } from "../../constants/langs.ts";

export const Footer = () => {
  const { i18n, t } = useTranslation();

  const onChangeLang = (event) => {
    const newLang = event.target.value;
    i18n.changeLanguage(newLang);
  };
  return (
    <div>
      <h1>{t("titleFooter")}</h1>
    </div>
  );
};

export default Footer;
