package PCCE.TEST;


//[PCCE 기출문제] : 8번/창고정리
public class Question8_WarehouseOrganization {
	/*
	 * 디버깅(Debugging) 문제
	 * 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
	 * 1줄만 수정하여 버그를 고치세요.
	 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
	 * 
	 */
	public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];
        
        for(int i=0; i<storage.length; i++){
            int clean_idx = -1;
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            if(clean_idx == -1){
                clean_storage[num_item] = (storage[i]);
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }
        
        // 아래 코드에는 틀린 부분이 없습니다.
        
        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}