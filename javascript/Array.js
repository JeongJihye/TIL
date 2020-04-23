/**
 * map
 * description : 배열 내의 모든 요소에 대해 함수를 실행 후 새로운 배열을 반환한다.
 */
function arrayMap() {
	var array1 = [1, 2, 3];
	var new_array1 = array1.map(x => x * 2);
	// new_array1 : [2, 4, 8]
	
	var array2 = [1, 2, 3];
	var new_array2 = array.map(function(number) {
	    return number * 2;
	});
	// new_array2 : [2, 4, 8]
}