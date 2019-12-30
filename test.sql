/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-12-30 19:45:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `username` varchar(256) NOT NULL,
  `content` varchar(256) NOT NULL,
  `data` date NOT NULL,
  `favour` varchar(256) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
