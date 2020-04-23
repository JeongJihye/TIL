/**
 * 날짜로 요일을 구한다.
 */
function getDayOfWeek() {
	var strDt = "20200415"
		
	var week = ['일', '월', '화', '수', '목', '금', '토'];
	var dayOfWeek = week[new Date(strDt).getDay()];
	
	return dayOfWeek;
}
