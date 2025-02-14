 "package app.src.test.resources;"

Repositories={
maven.Central()
}
dependencies={
implementation,"redis.clients:jedis:5.2.0"

}

ClassMemberDeclaration;

Package org.example;

Import redis;
clients.jedis.Unified Jedis;
public static void main(String[]args){
unifiedJedis=new unified();
Jedis("redis://localhost:6739");
jedis.close();
}

public jedis getDirectConnection(){
Jedis Pool;
Jedis jedis;
jedis=new jedis("localhost");
return jedis;

}

Public rest;close DirectConnection(){
if(jedis=!null);
jedis.close();
}

public jedis get_connection(){
pool=new jedis();
pool(new jedis.pool(config(),localhost));
jedis pool=getResource();
return redis;
}

public Destroy pool(){
if(jedis!=null);get.close();
if(Pool=null) {
pool.destroy();
}
}



