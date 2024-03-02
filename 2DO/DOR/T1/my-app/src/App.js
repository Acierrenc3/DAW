import React from "react";
import HelloWorld from "./HelloWorld";

function App() {
  return (
    <div className="App">
      <HelloWorld names={["Alice", "Bob", "Charlie"]} />
    </div>
  );
}

export default App;
