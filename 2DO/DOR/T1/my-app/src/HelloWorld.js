import React from "react";

class HelloWorld extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      clicks: 0,
      newName: "",
    };

    this.handleClick = this.handleClick.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleClick() {
    this.setState({ clicks: this.state.clicks + 1 });
  }

  handleChange(e) {
    this.setState({ newName: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    this.props.names.push(this.state.newName);
    this.setState({ newName: "" });
  }

  render() {
    let content;
    if (this.props.names !== undefined && this.props.names.length > 0) {
      content = this.props.names.map((name) => <li key={name}>{name} </li>);
    } else {
      content = <p>There is no names to display.</p>;
    }

    return (
      <div>
        <h1>Hello, Coders!</h1>
        <ul>{content}</ul>
        <form onSubmit={this.handleSubmit}>
          <input
            type="text"
            value={this.state.newName}
            onChange={this.handleChange}
          ></input>
          <input type="submit" value="Add Name" />
        </form>
        <p onClick={this.handleClick}>
          You have clicked this component {this.state.clicks} time/s.
        </p>
      </div>
    );
  }
}

export default HelloWorld;
