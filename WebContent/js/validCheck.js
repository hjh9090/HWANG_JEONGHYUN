//비어 있으면 에러
function isEmpty(input) {
	return !input.value;
}
//글자수가적으면 에러
function lessThan(input, length) {
	return input.value.length < length;
}
//숫자가 아니면 에러
function inNotNumber(input) {
	return isNaN(input.value);
}
