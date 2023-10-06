if(loginSuccessful){
   login.severe("User login succeeded for: "+sanitizeUser(username));
}else{
   login.severe("User login failed for: "+sanitizeUser(username));
}
