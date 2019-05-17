# iteration

### map
* 배열 내의 모든 요소 각각에 대해 주어진 함수를 실행 후 해당 결과를 모아 새로운 배열을 반환한다.

```
var array = [1, 2, 3];
var new_array = array.map(x => x * 2);
// new array : [2, 4, 8]
```

```
var array = [1, 2, 3];
var new_array = array.map(function(number) {
    return number * 2;
});
// new array : [2, 4, 8]
```

