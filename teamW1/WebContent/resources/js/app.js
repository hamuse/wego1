var app= (()=>{
    return{
        init : (ctx)=>{
            $('#login_btn').click(()=>{
                alert('로그인!!!!!!');
                location.assign(ctx+'/login.do?action=login&page=mypage');
            });
            $('#join_btn').click(()=>{
                alert('회원가입 이동');
                location.assign(ctx+'/facade.do?action=move&page=join');
            });
            btn.login2(ctx);
            btnjoin.joinbtn(ctx);
        }
            
    };
})();
var member = (()=>{
    var _dName,_deptNo,_eName,_empNo,_dName,_job,_mgr,_hireDate,_comm;
    var setEmpNo = (empNo)=>{this._empNo = empNo;}
    var setEName = (eName)=>{this._eName = eName;}
    var setDName = (dName)=>{this._dName = dName;}
    var getEmpNo = ()=>{return this._setEmpNo;}
    var getEName = ()=>{return this._setEName;}
    var getDName = ()=>{return this._setDName;}
    return{
        setEmpNo : setEmpNo,setEName : setEName,setDName : setDName,
        getEmpNo : getEmpNo,getEName : getEName,getDName : getDName
    };
})();
var btn= (()=>{
	return{
		 login2 : (ctx)=>{
			   $('#login_btn').click(()=>{
	            	if($('#d_Name').val()===''||$('#empNo').val()===''||
	            			$('#eName').val()===''){
	            		alert('필수값이 없습니다')}
	            		else{
	            			alert('입력한 아이디 값: '+$('#empNo').val());
	            			$('#login_form')
	            			$('#login_form').attr('action', ctx+'/login.do');
	            			$('#login_form').attr('method','POST');
	            			$('#login_form').submit();	
	            		}
	            }); 
		 }
	};
})();

var btnjoin=(()=>{
	return{
		joinbtn : (ctx)=>{
			$('#join_btn1').click(()=>{
				alert('회원가입!!!됐냐?!!!');
				$('#join_form').attr('action',ctx+'/login.do');
				$('#join_form').submit();
				
			});
		}
	};
})();