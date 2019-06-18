# Life Cycle
* 컴포넌트가 브라우저상에서의 다양한 행위에 따라 발생되는 메소드

### constructor
* 컴포넌트가 생성되기 전 가장 먼저 실행된다.
* 생성자 메소드 안에서 super()가 가장 먼저 사용되어야 한다.
* 생성자 메소드에서는 state를 설정하거나, 이벤트 헨들러를 binding 한다.

```
import React, { Component } from 'react';

class App extends Component {
    constructor(props) {
        super(props);
        this.setState = {
            text: 'hi'
        }
    }

    render() {
        return (
            <h1>{ this.state.test }</h1> 
        )
    }
}
```


### componentDidMount
* 컴포넌트가 마운트 된 이후에 실행되는 메소드
* 비동기 요청을 하거나 웹소켓 리스터, 파이어베이스 리스너 등의 리스너를 등록한다.
* dom을 사용하는 외부 라이브러리를 연동하거나 dom의 속성을 읽거나 직접 변경하는 작업을 진행한다.


### shouldComponentUpdate
* state나 props가 변경될 때 사용되는 메소드
* 컴포넌트를 다시 렌더링(render()함수 호출) 할지 결정한다.
* 기본적으로 true를 반환하며 false를 반환하면 렌더링 하지 않는다.


### componentWillUnMount
* 컴포넌트가 언마운트 된 이후에 실행되는 메소드
* componentDidMount에서 등록된 리스너들을 해제하고 dispose등의 기능을 호출한다.
* 메모리 누수를 방지해준다.