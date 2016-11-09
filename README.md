# mybatis-exercise
The scripts to create user table in mysql.
CREATE TABLE  user (
  user_id int(10) unsigned NOT NULL auto_increment,
  email_id varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) default NULL,
  PRIMARY KEY  (user_id),
  UNIQUE KEY Index_2_email_uniq (email_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

refer to: https://www.javacodegeeks.com/2012/11/mybatis-tutorial-crud-operations-and-mapping-relationships-part-1.html
