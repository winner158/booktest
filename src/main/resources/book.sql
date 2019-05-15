/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 15/05/2019 15:07:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for b_book
-- ----------------------------
DROP TABLE IF EXISTS `b_book`;
CREATE TABLE `b_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_category_id` int(11) NOT NULL,
  `upload_user_id` int(11) DEFAULT NULL,
  `upload_user_openid` varchar(255) DEFAULT NULL,
  `bookName` varchar(255) DEFAULT NULL,
  `bookReview` varchar(5000) DEFAULT NULL,
  `isShared` int(11) DEFAULT NULL,
  `readPeriod` int(11) DEFAULT NULL,
  `uploadDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of b_book
-- ----------------------------
BEGIN;
INSERT INTO `b_book` VALUES (11, 1, 0, 'oUQEd5CHTXeVpPH5x1oArQe_xkc4', '平凡的世界', '平凡的人生，不一样的生活', 1, 40, '2019-04-27 10:51:22');
INSERT INTO `b_book` VALUES (12, 2, 0, 'oUQEd5CHTXeVpPH5x1oArQe_xkc4', '那些年我们追过的女孩子', '的确很好看，值得一看', 1, 80, '2019-04-27 11:00:58');
COMMIT;

-- ----------------------------
-- Table structure for b_categorylist
-- ----------------------------
DROP TABLE IF EXISTS `b_categorylist`;
CREATE TABLE `b_categorylist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of b_categorylist
-- ----------------------------
BEGIN;
INSERT INTO `b_categorylist` VALUES (1, '哲学');
INSERT INTO `b_categorylist` VALUES (2, '心理学');
INSERT INTO `b_categorylist` VALUES (3, '计算机');
INSERT INTO `b_categorylist` VALUES (4, '量子力学');
INSERT INTO `b_categorylist` VALUES (5, '凝聚态物理');
INSERT INTO `b_categorylist` VALUES (6, '化学');
INSERT INTO `b_categorylist` VALUES (7, '材料');
COMMIT;

-- ----------------------------
-- Table structure for b_user
-- ----------------------------
DROP TABLE IF EXISTS `b_user`;
CREATE TABLE `b_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openId` varchar(200) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `avatarUrl` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `registerTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of b_user
-- ----------------------------
BEGIN;
INSERT INTO `b_user` VALUES (42, 'oUQEd5CHTXeVpPH5x1oArQe_xkc4', 'S.Y.F^O^', NULL, 1, 'Jiangsu', 'Nanjing', 'China', '2019-04-27 10:41:03');
COMMIT;

-- ----------------------------
-- Table structure for b_usercategorylist
-- ----------------------------
DROP TABLE IF EXISTS `b_usercategorylist`;
CREATE TABLE `b_usercategorylist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(200) DEFAULT NULL,
  `user_openid` varchar(255) DEFAULT NULL,
  `categorylist` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of b_usercategorylist
-- ----------------------------
BEGIN;
INSERT INTO `b_usercategorylist` VALUES (11, 0, 'oUQEd5CHTXeVpPH5x1oArQe_xkc4', '1,2,3,4,5,6');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
