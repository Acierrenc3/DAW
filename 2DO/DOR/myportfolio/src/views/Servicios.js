import React from "react";
import { useTranslation } from "react-i18next";

const Servicios = () => {
  const { t } = useTranslation();

  return (
    <div>
      <header>
        <h1>{t("titleServices")}</h1>
      </header>
      <section>
        <div className="servicio">
          <h2>{t("titleService1")}</h2>
          <p>{t("service1Description")}</p>
        </div>
        <div className="servicio">
          <h2>{t("titleService2")}</h2>
          <p>{t("service2Description")}</p>
        </div>
        <div className="servicio">
          <h2>{t("tittleService3")}</h2>
          <p>{t("service3Description")}</p>
        </div>
      </section>
    </div>
  );
};

export default Servicios;
