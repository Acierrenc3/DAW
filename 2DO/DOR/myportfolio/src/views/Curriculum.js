import React from "react";
import { useTranslation } from "react-i18next";

export const Curriculum = () => {
  const { t } = useTranslation();
  return (
    <div>
      <h1>{t("titleResume")}</h1>
      <h2>{t("titleH2Resume")}</h2>
      <p>{t("bodyResume")}</p>
    </div>
  );
};

export default Curriculum;
