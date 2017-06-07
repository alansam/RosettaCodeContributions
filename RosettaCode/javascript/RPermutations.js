
var d = document.getElementById('result');
 
function perm(list, ret) {
	if (list.length == 0) {
		var row = document.createTextNode(ret.join(' ') + '\n');
		d.appendChild(row);
		return;
	}
	for (var i = 0; i < list.length; i++) {
		var x = list.splice(i, 1);
		ret.push(x);
		perm(list, ret);
		ret.pop();
		list.splice(i, 0, x);
	}
}

