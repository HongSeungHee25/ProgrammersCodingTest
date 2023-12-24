package PCCE.TEST;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//[PCCE 기출문제] : 10번/데이터 분석
public class Question10_DataAnalysis {
	/*
	 * AI 엔지니어인 현식이는 데이터를 분석하는 작업을 진행하고 있습니다. 
	 * 데이터는 ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]으로 구성
	 * 현식이는 이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬하려 합니다.
	 * 
	 * 예를 들어 다음과 같이 데이터가 주어진다면
	 * data = [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]
	 * code	date	maximum	remain
	 *	1	20300104	100	80
	 *	2	20300804	847	37
	 *	3	20300401	10	8
	 * 주어진 데이터 중 "제조일이 20300501 이전인 물건들을 현재 수량이 적은 순서"로 정렬해야 한다면
	 * data = [[3,20300401,10,8],[1,20300104,100,80]]
	 * 
	 * 정렬한 데이터들이 담긴 이차원 정수 리스트 data
	 * 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext
	 * 뽑아낼 정보의 기준값을 나타내는 정수 val_ext
	 * 정보를 정렬할 기준이 되는 문자열 sort_by
	 * 
	 * data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후
	 * sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요.
	 * 단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.
	 */
	
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
	    List<int[]> filteredData = new ArrayList<>();

	    // 주어진 조건(ext)에 따라 데이터 필터링
	    for (int[] item : data) {
	        if (ext.equals("code") && item[0] < val_ext) { // "code"를 기준으로 필터링하는 경우
	            filteredData.add(item);
	        } else if(ext.equals("date") && item[1] < val_ext) { // "date"를 기준으로 필터링하는 경우
	            filteredData.add(item);
	        } else if(ext.equals("maximum") && item[2] < val_ext) { // "maximum"를 기준으로 필터링하는 경우
	            filteredData.add(item);
	        } else if(ext.equals("remain") && item[3] < val_ext) { // "remain"를 기준으로 필터링하는 경우
	            filteredData.add(item);
	        }
	    }

	    // sort_by에 해당하는 값을 기준으로 데이터 정렬
	    switch (sort_by) {
	        case "code":
	            filteredData.sort(Comparator.comparingInt(a -> a[0]));
	            break;
	        case "date":
	            filteredData.sort(Comparator.comparingInt(a -> a[1]));
	            break;
	        case "maximum":
	            filteredData.sort(Comparator.comparingInt(a -> a[2]));
	            break;
	        case "remain":
	            filteredData.sort(Comparator.comparingInt(a -> a[3]));
	            break;
	        default:
	            break;
	    }

	    // 정렬된 데이터를 2차원 배열로 변환하여 반환
	    int[][] answer = new int[filteredData.size()][4];
	    for (int i = 0; i < filteredData.size(); i++) {
	        answer[i] = filteredData.get(i);
	    }

	    return answer;
	}
}