window.addEventListener('keydown',func)
	function func(e){
		var k=e.keyCode
		k=String(k);
		var a;
		if(k=="65"){
		a=document.getElementById("65");
		
		}
		if(k=="83"){
		a=document.getElementById("83");
		
		}
		if(k=="71"){
		a=document.getElementById("71");
		
		}
		if(k=="72"){
		a=document.getElementById("72");
		
		}
		if(k=="73"){
		a=document.getElementById("73");
		
		}
		if(k=="74"){
		a=document.getElementById("74");
	
		}
		if(k=="75"){
		a=document.getElementById("75");
	
		}
		if(k=="76"){
		a=document.getElementById("76");
		
		}
		if(k=="32"){
		a=document.getElementById("32");
		
		}
		a.play();
		a.currentTime=0;
	}