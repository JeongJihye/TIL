package java;

public class _string {
	
	// 정규식
	// - 아스키코드와 유니코드 기반의 정규표현식
	public void regex() {
		// 1. 한글
		// - 유니코드를 참조한다.
		String strHangeul = "안녕하세요ㄱㄴㄷㄹㅁㅏㅑㅓㅕㅗ";
		
		// 1-1. 자음 제거
		strHangeul.replaceAll("[ㄱ-ㅎ]", ""); // 안녕하세요ㄱㄴㄷㄹㅁ
		strHangeul.replaceAll("[ㄱㄴㄷㄹㅁ]", ""); // 안녕하세요ㄱㄴㄷㄹㅁ
		
		// 1-2. 모음 제거
		strHangeul.replaceAll("[ㅏ-ㅣ]", ""); // 안녕하세요ㄱㄴㄷㄹㅁ
		
		// 1-3. 자음, 모음 제거
		strHangeul.replaceAll("[ㄱ-ㅣ]", ""); // 안녕하세요
		strHangeul.replaceAll("[ㅣ-ㄱ]", ""); // java.util.regex.PatternSyntaxException, 순서 때문에 에러
		
		// 1-4. 한글 제거
		strHangeul.replaceAll("[가-힣]", ""); // ㄱㄴㄷㄹㅁㅏㅑㅓㅕㅗ
		strHangeul.replaceAll("[ㅏ-힣]", ""); // ㄱㄴㄷㄹㅁ
		strHangeul.replaceAll("[ㄱ-ㅎ 가-힣]", ""); // ㅏㅑㅓㅕㅗ
		strHangeul.replaceAll("[ㄱ-힣]", "");  // 모두 제거		
		
		// 2. 영어
		String strEnglish = "ABCDEabcde";
		
		// 2-1. 대문자 제거
		strEnglish.replaceAll("[A-Z]", ""); // abcde
		
		// 2-2. 소문자 제거
		strEnglish.replaceAll("[a-e]", ""); // ABCDE
		
		// 2-3. 대, 소문자 제거
		strEnglish.replaceAll("[A-z]", ""); // 모두 제거
		strEnglish.replaceAll("[a-Z]", ""); // java.util.regex.PatternSyntaxException, 순서 때문에 에러(아스키코드의 순서는 대문자 다음 소문자)
		
		// 3. 숫자
		String strNumber = "ABCDEㄱㄴㄷㄹㅁ12345";
		
		// 3-1. 숫자만 제거
		strNumber.replaceAll("[0-9]", ""); // ABCDEㄱㄴㄷㄹㅁ
		
		// 3-2. 숫자만 남기고 제거
		strNumber.replaceAll("[^0-9]", ""); // 12345		
	}
}