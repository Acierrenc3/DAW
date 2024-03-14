import React from "react";
import { useTranslation } from "react-i18next";

const Empanadas = () => {
  const { t } = useTranslation();

  return (
    <div>
      <h1>{t("titleBodyEmpanada")}</h1>
    </div>
  );
};
export default Empanadas;
