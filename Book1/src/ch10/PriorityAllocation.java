package ch10;

public class PriorityAllocation implements Scheduler{
	
	//고객 등급이 높은 고객부터 가져와 업무 능력이 높은 상담원에게 배분
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skil 값이 높은 상담원에게 우선적으로 배분합니다.");
	}

}
