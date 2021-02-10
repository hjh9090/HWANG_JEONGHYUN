function check() {
	
	let name = document.form.name;
	let stuNum = document.form.stuNum;
	let perNum = document.form.perNum;
	let perNum2 = document.form.perNum2;
	//이름 유효성
	
	if(isEmpty(name) || lessThan(name, 2)) {
		alert('이름을 1글자 이상 입력 해 주세요');
		name.value = "";
		name.focus();
		return false;
	}
	
	//학번 유효성
	if(isEmpty(stuNum) || lessThan(stuNum, 8)) {
		alert('학번을 8글자 이상 입력 해 주세요');
		stuNum.value = "";
		stuNum.focus();
		return false;
	}
	
	if(isNotNumber(stuNum)) {
		alert('숫자 이외의 글자는 넣지 못합니다.');
		stuNum.value = "";
		stuNum.focus();
		return false;
	}
	
	//주민등록번호 유효성
	if(isEmpty(perNum) || lessThan(perNum, 5)) {
		alert('생년월일인 5글자 이상 입력 해야 합니다.');
		perNum.value = "";
		perNum.focus();
		return false;
	}
	
	if(isNotNumber(perNum)) {
		alert('숫자 이외의 글자는 넣지 못합니다.');
		perNum.value = "";
		perNum.focus();
		return false;
	}
	
	//주민등록번호 뒷 자리 유효성
	if(isEmpty(perNum2) || lessThan(perNum2, 6)) {
		alert('뒷자리는 6글자 이상 입력 해야 합니다.');
		perNum.value = "";
		perNum.focus();
		return false;
	}
	
	if(isNotNumber(perNum2)) {
		alert('숫자 이외의 글자는 넣지 못합니다.');
		perNum.value = "";
		perNum.focus();
		return false;
	}
	return true;
	
}

