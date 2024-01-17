const _0x259c51 = _0xfb57;
function _0xfb57(_0x32e44b, _0x5b5647) {
  const _0x27fb85 = _0x27fb();
  return (
    (_0xfb57 = function (_0xfb572d, _0x32bb8a) {
      _0xfb572d = _0xfb572d - 0xdc;
      let _0x14f4af = _0x27fb85[_0xfb572d];
      return _0x14f4af;
    }),
    _0xfb57(_0x32e44b, _0x5b5647)
  );
}
(function (_0x37cce7, _0x1928d4) {
  const _0x500d6a = _0xfb57,
    _0x60646c = _0x37cce7();
  while (!![]) {
    try {
      const _0x383a53 =
        (-parseInt(_0x500d6a(0xfe)) / 0x1) * (parseInt(_0x500d6a(0xe8)) / 0x2) +
        -parseInt(_0x500d6a(0x104)) / 0x3 +
        -parseInt(_0x500d6a(0xec)) / 0x4 +
        (parseInt(_0x500d6a(0xfb)) / 0x5) *
          (-parseInt(_0x500d6a(0x109)) / 0x6) +
        -parseInt(_0x500d6a(0xfc)) / 0x7 +
        -parseInt(_0x500d6a(0x11e)) / 0x8 +
        (parseInt(_0x500d6a(0x102)) / 0x9) * (parseInt(_0x500d6a(0x110)) / 0xa);
      if (_0x383a53 === _0x1928d4) break;
      else _0x60646c["push"](_0x60646c["shift"]());
    } catch (_0x4c0002) {
      _0x60646c["push"](_0x60646c["shift"]());
    }
  }
})(_0x27fb, 0xe26d9);
class Vehiculo {
  constructor(_0x5537f4, _0x24d426, _0x569ec1, _0xa3ad99, _0x40f3e2) {
    const _0x505548 = _0xfb57;
    (this[_0x505548(0xf1)] = _0x5537f4),
      (this[_0x505548(0x112)] = _0x24d426),
      (this["color"] = _0x569ec1),
      (this[_0x505548(0x11f)] = _0xa3ad99),
      (this[_0x505548(0x11a)] = _0x40f3e2),
      (this[_0x505548(0xf7)] = []),
      alert(
        "Creado\x20Vehiculo\x20de\x20Marca:\x20" +
          _0x5537f4 +
          _0x505548(0x10b) +
          _0x24d426 +
          _0x505548(0x10a) +
          _0x569ec1 +
          ",\x20Año:\x20" +
          _0xa3ad99 +
          _0x505548(0x118) +
          _0x40f3e2
      );
  }
  [_0x259c51(0xe6)]() {
    const _0x308f02 = _0x259c51;
    return (
      _0x308f02(0xe3) +
      this[_0x308f02(0xf1)] +
      _0x308f02(0xef) +
      this[_0x308f02(0x112)] +
      _0x308f02(0xdc) +
      this["color"] +
      _0x308f02(0xe0) +
      this[_0x308f02(0x11f)] +
      _0x308f02(0x11b) +
      this[_0x308f02(0x11a)]
    );
  }
  ["agregarObservaciones"]() {
    const _0xd3ae05 = _0x259c51;
    if (confirm(_0xd3ae05(0x111))) {
      let _0x208d38 = prompt(_0xd3ae05(0xee));
      this[_0xd3ae05(0xf7)][_0xd3ae05(0xff)]({ Obs: _0x208d38 });
    }
  }
  [_0x259c51(0x119)]() {
    const _0x93aefe = _0x259c51;
    console["log"](_0x93aefe(0xe9) + this[_0x93aefe(0x11a)]),
      this[_0x93aefe(0xf7)][_0x93aefe(0x105)]((_0xba9dad) =>
        console["log"](_0xba9dad)
      );
  }
  ["modificarMarca"]() {
    const _0xa8df3f = _0x259c51;
    confirm(_0xa8df3f(0xfa)) &&
      ((this[_0xa8df3f(0xf1)] = prompt(
        "Introduzca\x20la\x20nueva\x20marca\x20del\x20vehiculo"
      )),
      alert(_0xa8df3f(0x108) + this["marca"]));
  }
  ["modificarModelo"]() {
    const _0x52666f = _0x259c51;
    confirm("¿Desea\x20modificar\x20el\x20modelo\x20del\x20Vehiculo?") &&
      ((this[_0x52666f(0x112)] = prompt(_0x52666f(0xf4))),
      alert(_0x52666f(0x103) + this["modelo"]));
  }
  [_0x259c51(0x10f)]() {
    const _0xfa1cb3 = _0x259c51;
    confirm("¿Desea\x20modificar\x20el\x20Año\x20del\x20Vehiculo?") &&
      ((this[_0xfa1cb3(0x11f)] = prompt(_0xfa1cb3(0xf9))),
      alert("Nuevo\x20año:\x20" + this[_0xfa1cb3(0x11f)]));
  }
  ["modificarColor"]() {
    const _0x29d85e = _0x259c51;
    confirm(_0x29d85e(0xfd)) &&
      ((this[_0x29d85e(0xea)] = prompt(_0x29d85e(0x116))),
      alert("Nuevo\x20color:\x20" + this[_0x29d85e(0xea)])),
      alert("Error\x20al\x20modificar\x20el\x20Color:\x20" + error["message"]);
  }
  [_0x259c51(0x11c)]() {
    const _0x315fc4 = _0x259c51;
    confirm(_0x315fc4(0xf3)) &&
      ((this[_0x315fc4(0x11a)] = prompt(
        "Introduzca\x20la\x20nueva\x20Matricula"
      )),
      alert("Nueva\x20matricula:\x20" + this[_0x315fc4(0x11a)])),
      alert(_0x315fc4(0x115) + error[_0x315fc4(0xf6)]);
  }
}
let vehiculoActual;
function crearNuevo() {
  const _0x21d8c6 = _0x259c51;
  try {
    let _0xf4924a = document[_0x21d8c6(0xde)](_0x21d8c6(0xf1))[
        _0x21d8c6(0x101)
      ],
      _0x2f7c79 = document[_0x21d8c6(0xde)](_0x21d8c6(0x112))[_0x21d8c6(0x101)],
      _0xed10c5 = document[_0x21d8c6(0xde)](_0x21d8c6(0xea))[_0x21d8c6(0x101)],
      _0x3adf36 = document[_0x21d8c6(0xde)](_0x21d8c6(0xe5))[_0x21d8c6(0x101)],
      _0x15a7fa = document["getElementById"]("matricula")[_0x21d8c6(0x101)],
      _0x5b256d = /^[0-9]{1,4}[BCDFGHJKLMNPRSTVWXYZ]{3}/[_0x21d8c6(0x100)](
        _0x15a7fa
      );
    !_0x5b256d && alert(_0x21d8c6(0xdf)),
      (vehiculoActual = new Vehiculo(
        _0xf4924a,
        _0x2f7c79,
        _0xed10c5,
        _0x3adf36,
        _0x15a7fa
      )),
      (document[_0x21d8c6(0xde)]("datosvehiculo")[_0x21d8c6(0xf2)] =
        vehiculoActual["obtenerInformacion"]());
  } catch (_0x1f450d) {
    alert(
      "Error\x20al\x20crear\x20el\x20vehiculo:\x20" + _0x1f450d[_0x21d8c6(0xf6)]
    );
  }
  return ![];
}
function _0x27fb() {
  const _0x2fce2b = [
    "¿Desea\x20cambiar\x20el\x20color\x20del\x20vehiculo?",
    "249377OtIxwD",
    "push",
    "test",
    "value",
    "315279XwsIia",
    "Nuevo\x20modelo:\x20",
    "4846803czTwMt",
    "forEach",
    "Error\x20al\x20cambiar\x20la\x20matrícula:\x20",
    "modificarColor",
    "Nueva\x20marca:\x20",
    "2754aVdNJy",
    ",\x20Color:\x20",
    ",\x20Modelo:\x20",
    "datosvehiculo",
    "Error\x20al\x20cambiar\x20el\x20color:\x20",
    "Observaciones:\x20",
    "modificarAnio",
    "1930cfgjoV",
    "¿Desea\x20agregar\x20alguna\x20observación?",
    "modelo",
    "modificarAnho",
    "Error\x20al\x20modificar\x20el\x20modelo:\x20",
    "Error\x20al\x20modificar\x20la\x20Matricula:\x20",
    "Introduzca\x20el\x20nuevo\x20color",
    "onclick",
    "\x20y\x20con\x20Matricula:\x20",
    "mostrarObservaciones",
    "matricula",
    "\x0aMatricula:\x20",
    "modificarMatricula",
    "modificarModelo",
    "10566768vxKdMt",
    "anio",
    "¿Desea\x20limpiar\x20el\x20formulario\x20actual?",
    "¿Desea\x20modificar\x20el\x20modelo\x20del\x20Vehiculo?",
    "reload",
    "\x0aColor:\x20",
    "agregarObservaciones",
    "getElementById",
    "La\x20matricula\x20no\x20es\x20valida",
    "\x0aAño:\x20",
    "location",
    "¿Desea\x20modificar\x20el\x20Año\x20del\x20Vehiculo?",
    "Marca:\x20",
    "length",
    "anho",
    "obtenerInformacion",
    "Error\x20al\x20modificar\x20la\x20marca:\x20",
    "8uTkdck",
    "Historial\x20del\x20vehiculo:\x20",
    "color",
    "Error\x20al\x20modificar\x20el\x20año:\x20",
    "2904048vqWLmx",
    "crearnuevo",
    "Introduzca\x20las\x20observaciones\x20pertinentes",
    "\x0aModelo:\x20",
    "modificarMarca",
    "marca",
    "textContent",
    "¿Desea\x20cambiar\x20la\x20matricula\x20del\x20vehiculo?",
    "Introduzca\x20el\x20nuevo\x20modelo",
    "Obs",
    "message",
    "observaciones",
    "Error\x20al\x20agregar\x20observaciones:\x20",
    "Introduzca\x20el\x20nuevo\x20año\x20de\x20fabricación",
    "¿Desea\x20modificar\x20la\x20marca?",
    "5510GgBhaU",
    "4674243AaMwlU",
  ];
  _0x27fb = function () {
    return _0x2fce2b;
  };
  return _0x27fb();
}
function modificarMarca() {
  const _0x33d762 = _0x259c51;
  try {
    confirm(_0x33d762(0xfa)) &&
      (vehiculoActual["modificarMarca"](),
      (document["getElementById"](_0x33d762(0x10c))[_0x33d762(0xf2)] =
        vehiculoActual["obtenerInformacion"]()));
  } catch (_0x5f0d9f) {
    alert(_0x33d762(0xe7) + _0x5f0d9f["message"]);
  }
}
function modificarModelo() {
  const _0x3ab8dd = _0x259c51;
  try {
    confirm(_0x3ab8dd(0x121)) &&
      (vehiculoActual[_0x3ab8dd(0x11d)](),
      (document[_0x3ab8dd(0xde)](_0x3ab8dd(0x10c))["textContent"] =
        vehiculoActual[_0x3ab8dd(0xe6)]()));
  } catch (_0x30e593) {
    alert(_0x3ab8dd(0x114) + _0x30e593["message"]);
  }
}
function modificarColor() {
  const _0x3d09a7 = _0x259c51;
  try {
    confirm("¿Desea\x20cambiar\x20el\x20color\x20del\x20vehiculo?") &&
      (vehiculoActual[_0x3d09a7(0x107)](),
      (document[_0x3d09a7(0xde)](_0x3d09a7(0x10c))[_0x3d09a7(0xf2)] =
        vehiculoActual[_0x3d09a7(0xe6)]()));
  } catch (_0x38ea0d) {
    alert(_0x3d09a7(0x10d) + _0x38ea0d[_0x3d09a7(0xf6)]);
  }
}
function modificarAnio() {
  const _0x3d2383 = _0x259c51;
  try {
    confirm(_0x3d2383(0xe2)) &&
      (vehiculoActual["modificarAnio"](),
      (document[_0x3d2383(0xde)](_0x3d2383(0x10c))[_0x3d2383(0xf2)] =
        vehiculoActual[_0x3d2383(0xe6)]()));
  } catch (_0x3d86e4) {
    alert(_0x3d2383(0xeb) + _0x3d86e4[_0x3d2383(0xf6)]);
  }
}
function modificarMatricula() {
  const _0x24de00 = _0x259c51;
  try {
    confirm(_0x24de00(0xf3)) &&
      (vehiculoActual[_0x24de00(0x11c)](),
      (document["getElementById"](_0x24de00(0x10c))["textContent"] =
        vehiculoActual[_0x24de00(0xe6)]()));
  } catch (_0x234536) {
    alert(_0x24de00(0x106) + _0x234536["message"]);
  }
}
function agregarObservaciones() {
  const _0x1e2bd6 = _0x259c51;
  try {
    vehiculoActual[_0x1e2bd6(0xdd)]();
    let _0x78f2d6 = "";
    for (
      let _0x4302ee = 0x0;
      _0x4302ee < vehiculoActual["observaciones"][_0x1e2bd6(0xe4)];
      _0x4302ee++
    ) {
      _0x78f2d6 +=
        _0x1e2bd6(0x10e) +
        vehiculoActual[_0x1e2bd6(0xf7)][_0x4302ee][_0x1e2bd6(0xf5)] +
        "\x0a";
    }
    document[_0x1e2bd6(0xde)](_0x1e2bd6(0xf7))[_0x1e2bd6(0xf2)] = _0x78f2d6;
  } catch (_0x45544c) {
    alert(_0x1e2bd6(0xf8) + _0x45544c[_0x1e2bd6(0xf6)]);
  }
}
function limpiarFormulario() {
  const _0x180ca8 = _0x259c51;
  confirm(_0x180ca8(0x120)) && window[_0x180ca8(0xe1)][_0x180ca8(0x122)]();
}
(document[_0x259c51(0xde)](_0x259c51(0xed))[_0x259c51(0x117)] = crearNuevo),
  (document["getElementById"](_0x259c51(0xf0))[_0x259c51(0x117)] =
    modificarMarca),
  (document["getElementById"](_0x259c51(0x11d))[_0x259c51(0x117)] =
    modificarModelo),
  (document["getElementById"](_0x259c51(0x107))[_0x259c51(0x117)] =
    modificarColor),
  (document[_0x259c51(0xde)](_0x259c51(0x113))[_0x259c51(0x117)] =
    modificarAnio),
  (document[_0x259c51(0xde)](_0x259c51(0x11c))["onclick"] = modificarMatricula),
  (document["getElementById"]("agregarObs")["onclick"] = agregarObservaciones),
  (document["getElementById"]("limpiar")[_0x259c51(0x117)] = limpiarFormulario);
