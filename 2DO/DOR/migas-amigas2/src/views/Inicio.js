import React from "react";
import { useTranslation } from "react-i18next";

const Inicio = () => {
  const { t } = useTranslation();

  return (
    <div>
      <h1>{t("titleBody")}</h1>
    </div>
  );
};
export default Inicio;
