# state, props
* state와 props 값이 변경될 때마다 render()가 수행된다.
* 데이터 흐름은 상위에서 하위 컴포넌트로 단방향이다.


### state
* state는 컴포넌트에서 유동적인 데이터를 처리할 때 사용된다.
* 직접 변경되면 안되고, setState()를 호출해서 변경해야 한다.
* getInitialState : React 컴포넌트 상태값 초기화

```
import React, { Component } form 'react';

class App extends Component {   
    constructor(props) {
        super(props);

        // state 초기값 설정
        this.state = {
            header: 'hader initial',
            content: 'content initial'
        };
    }

    _updateHeader = () => {
        // state 값 변경
        this.setState({
            header: 'header update'
        });
    }

    render() {
        return (
            <div>
                <h1>{ this.state.header }</h1>
                <h2>{ this.state.content }</h2>
                <button onClick={ this._updateHeader }>update</button>
            </div>
        )
    }
}

export default App;

```

* state 초기값을 설정할 때는 constructor(생성자)에서 this.state = {} 을 통해 설정한다.
* state를 변경할 때는 this.setState() 메소드를 사용한다.
* state를 렌더링할 때는 { this.state.state_name } 을 사용한다.


### props
* props는 객체, 함수 등 어떤 타입이든 가능하다.
* props는 컴포넌트에서 사용될 데이터 중 변하지 않는 데이터를 다룰 때 사용한다.
* props를 변경할 때는 상위 컴포넌트에서 변경해야 한다.

```
import React, { Component } from 'react';

class App Extends Component {
    render() {
        return (
            <div>
                <Header title={ this.props.title } />
                <Content content={ this.props.content } />
            </div>
        )
    }
}
```

```
import React from 'react';
import ReactDOM from 'react-dom';
import App from './components/App';

const rootElement = document.getElementById('root');

// 하위 컴포넌트인 App에 props 전달
ReactDOM.render(<App headerTitle = 'header!' contentTitle = 'content~,', rootElement);
```


##### defaultProps
* props가 실수로 빠졌거나 일부러 비워야 할 경우에 기본값을 설정한다.

```
import React, { Component } extends 'react';

class App extends Component {
    static defaultProps = {
        name: '홍길동'
    }

    render() {
        return (
            <div>
                { this.props.name }
            </div>
        )
    }
}

export default App;
```