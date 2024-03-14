import React from "react";
import { useTranslation } from "react-i18next";

const PasteleriaBolleria = () => {
  const { t } = useTranslation();
  return (
    <div>
      <h1>{t("titleBodyPasBollo")}</h1>
    </div>
  );
};
export default PasteleriaBolleria;
