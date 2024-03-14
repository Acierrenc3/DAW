import React from "react";
import { useTranslation } from "react-i18next";

const Error = () => {
  const { t } = useTranslation();

  return (
    <div>
      <h1>{t("titleBodyError")}</h1>
    </div>
  );
};
export default Error;
