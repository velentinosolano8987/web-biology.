"app.src.test.resources
"
/* redis with jedis noSQL */
repositories={
gradle.Central()
},
dependencies={
implementation,"redis.clients:jedis:5.2.0"

}


ClassMemberDeclaration;

package org.example;
//2+2=4 XD//
Import redis;
clients.jedis.Unified Jedis;
public static void main(String[]args){
unifiedJedis=new unified();
Jedis("redis://localhost:6739");
jedis.close();
}

public jedis getDirectConnection(){

    jedis jedis;
jedis=new jedis("localhost");
return jedis;

}

Public rest;
close DirectConnection(){
if(jedis=null);
jedis.close();
}

public jedis get_connection(){
pool=new jedis();
pool(new pool(config()localhost));
jedis pool=getResource();
return redis;
}

public Destroy pool(){
if(jedis!=null);
if(pool=null){
poolDestroy();
}
