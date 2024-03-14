import React from "react";
import { useTranslation } from "react-i18next";

const Proyectos = () => {
  const { t } = useTranslation();

  return (
    <div>
      <header>
        <h1>{t("titleProjects")}</h1>
      </header>
      <section>
        <div className="proyecto">
          <h2>{t("project1Title")}</h2>
          <p>{t("proyect1Description")}</p>
        </div>
        <div className="proyecto">
          <h2>{t("proyect2Title")}</h2>
          <p>{t("proyect2Description")}</p>
        </div>
        <div className="proyecto">
          <h2>{t("proyect3Title")}</h2>
          <p>{t("proyect3Description")}</p>
        </div>
      </section>
    </div>
  );
};

export default Proyectos;
