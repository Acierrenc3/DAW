import React from "react";
import { useTranslation } from "react-i18next";

const Principal = () => {
  const { t } = useTranslation();
  return (
    <div>
      <section>
        <h1>{t("titleMain")} </h1>
        <p>{t("bodyMain")}</p>
      </section>
    </div>
  );
};

export default Principal;
