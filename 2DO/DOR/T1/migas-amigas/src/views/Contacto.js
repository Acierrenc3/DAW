import React from "react";
import { useTranslation } from "react-i18next";

const Contacto = () => {
  const { t } = useTranslation();

  return (
    <div>
      <h1>{t("titleBodyContacto")}</h1>
    </div>
  );
};
export default Contacto;
