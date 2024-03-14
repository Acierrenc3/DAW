import React from "react";
import { useTranslation } from "react-i18next";
import { LANGUAGES } from "../../constants/lang.ts";

const HeaderNav = () => {
  const { i18n, t } = useTranslation();

  const onChangeLang = (e) => {
    const selectedLang = e.target.value;
    i18n.changeLanguage(selectedLang);
  };

  return (
    <div>
      <h1>{t("titleHeader")}</h1>
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
