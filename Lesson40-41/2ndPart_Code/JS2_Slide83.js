Teacher.prototype.greeting = function() { 
var prefix; 
if (this.gender === 'male' || this.gender === 'Male' || this.gender === 'm' || this.gender === 'M') { 
	prefix = 'Mr.'; 
} 
else if (this.gender === 'female' || this.gender === 'Female' || this.gender === 'f' || this.gender === 'F') { 
	prefix = 'Mrs.'; 
} 
else { 
	prefix = 'Mx.'; 
}
alert('Hello. My name is ' + prefix + ' ' + this.name.last + ', and I teach ' + this.subject + '.'); 
};
