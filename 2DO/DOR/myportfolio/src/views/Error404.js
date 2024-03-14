import React from "react";
import { useTranslation } from "react-i18next";

export const Error404 = () => {
  const { t } = useTranslation();
  return (
    <div>
      <h1>{t("titleError")} </h1>
    </div>
  );
};

export default Error404;
