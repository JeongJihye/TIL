# iteration
* state 내부의 값은 직접적으로 수정하면 안된다. => 불변성 유지
* push, splice, unshift, pop 같은 함수는 배열 자체를 직접적으로 수정하기 때문에 사용할 수 없다.
* concat, slice, map, filter 같은 기존의 배열에 기반하여 새 배열을 만들어 내는 함수를 사용해야 한다.

### state에 데이터 추가/제거/수정

##### 데이터 추가

```
import React, { Component } from 'react';

class App extends Component {
    constructor(props) {
        super(props);

        this.state = {
            information: [  
              {
                  name: '홍길동',
                  age: '27'
              },
              {
                  name: '김영희',
                  age : '28'
              }
            ]            
        };

        this._handleCreate = this._handleCreate.bind(this);
    }

    _handleCreate = () => {
        const { information } = this.state;
        this.setState({
            // concat을 이용하여 기존 배열에 새로운 데이터 추가
            information: information.concat({name: '추가', age: '0'})
        })
    }

    render() {
        const { information } = this.state;
        return (
            <div>
                {JSON.stringify(information)}
                <button onClick={this._handleCreate}>추가</button>
            </div>
        )
    }
}
export default App;
```


##### 데이터 삭제
* filter 함수를 사용하여 특정 조건에 부합되는 원소들만 뽑아서 새로운 배열을 만든다.

```
import React, { Component } from 'react';

class App extends Component {
    constructor(props) {
        super(props);

        this.state = {
            information: [  
              {
                  name: '홍길동',
                  age: '27'
              },
              {
                  name: '김영희',
                  age : '28'
              }
            ]            
        };

        this._handleCreate = this._handleCreate.bind(this);
        this._handleDelete = this._handleDelete.bind(this);
    }

    _handleCreate = () => {
        const { information } = this.state;
        this.setState({
            // concat을 이용하여 새로운 배열 생성
            information: information.concat({name: '추가', age: '0'})
        })
    }

    _handleDelete = () => {
        const { information } = this.state;
        this.setState({
            // filter를 이용하여 id가 0인 원소로만 새로운 배열 생성
            information: information.filter(info => info.id === 0)
        })
    }

    render() {
        const { information } = this.state;
        return (
            <div>
                {JSON.stringify(information)}
                <button onClick={this._handleCreate}>추가</button>
                <button onClick={this._handleDelete}>삭제</button>
            </div>
        )
    }
}
export default App;
```


##### 데이터 수정

```
import React, { Component } from 'react';

class App extends Component {
    constructor(props) {
        super(props);

        this.state = {
            information: [  
              {
                  name: '홍길동',
                  age: '27'
              },
              {
                  name: '김영희',
                  age : '28'
              }
            ]            
        };

        this._handleCreate = this._handleCreate.bind(this);
        this._handleDelete = this._handleDelete.bind(this);
        this._handleUpdate = this._handleUpdate.bind(this);
    }

    _handleCreate = () => {
        const { information } = this.state;
        this.setState({
            // concat을 이용하여 새로운 배열 생성
            information: information.concat({name: '추가', age: '0'})
        })
    }

    _handleDelete = () => {
        const { information } = this.state;
        this.setState({
            // filter를 이용하여 id가 0인 원소로만 새로운 배열 생성
            information: information.filter(info => info.id === 0)
        })
    }

    _handleUpdate = () => {
        const { information } = this.state;
        this.setState({
            // map을 이용하여 id가 0인 원소인 경우에 해당 내용으로 수정하여 새로운 배열 생성
            information: information.map(
                info => info.id === 0
                    ?   info = {id: 0, name: "수정", age: "99"}
                    :   info
            )
        })
    }

    render() {
        const { information } = this.state;
        return (
            <div>
                {JSON.stringify(information)}
                <button onClick={this._handleCreate}>추가</button>
                <button onClick={this._handleDelete}>삭제</button>
                <button onClick={this._handleUpdate}>수정</button>
            </div>
        )
    }
}
export default App;
```  