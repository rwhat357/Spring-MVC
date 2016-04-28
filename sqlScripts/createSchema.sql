
###================ STEP 1: CREATE DATABASES ================###
# create database fitness_tracker
CREATE SCHEMA `fitness_tracker` ;

###================ STEP 2: CREATE TABLES ================###
# create table user
CREATE TABLE `fitness_tracker`.`user` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`username` VARCHAR(45) NULL,
	`firstname` VARCHAR(45) NULL,
	`lastname` VARCHAR(45) NULL,
	`email` VARCHAR(45) NOT NULL,
	`password` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `id_UNIQUE` (`id` ASC));
 
# create table plan
CREATE TABLE `fitness_tracker`.`plan` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(45) NOT NULL,
	`duration` VARCHAR(45) NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `id_UNIQUE` (`id` ASC));

# create table user_plan
CREATE TABLE `fitness_tracker`.`user_plan` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`id_plan` VARCHAR(45) NOT NULL,
	`id_user` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `id_UNIQUE` (`id` ASC));
	
###================ STEP 3: INSERT DATA ================###
INSERT INTO `fitness_tracker`.`user` (`id`, `username`, `firstname`, `lastname`, `email`, `password`) VALUES ('0', 'fredywhatley', 'Fredy', 'Whatley', 'fredywhatley@gmail.com', '12345');
INSERT INTO `fitness_tracker`.`user` (`id`, `username`, `firstname`, `lastname`, `email`, `password`) VALUES ('1', 'stareslomax', 'Raul', 'What', 'stareslomax@yahoo.com', '12345');
