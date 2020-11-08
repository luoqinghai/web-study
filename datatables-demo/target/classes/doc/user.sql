/*
 Navicat Premium Data Transfer

 Source Server         : docker-mysql5.7
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 192.168.0.110:3306
 Source Schema         : datatables_demo

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 07/08/2020 17:47:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_addr` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '宋江', '山东省郓城县', '2020-08-01 15:52:00', 1, 2);
INSERT INTO `user` VALUES (3, '卢俊义', '北京大名府', '2020-08-02 15:52:25', 1, 2);
INSERT INTO `user` VALUES (4, '吴用', '山东省菏泽市郓城县车市村人', '2020-08-03 15:52:27', 1, 2);
INSERT INTO `user` VALUES (5, '公孙胜', '蓟州人氏', '2020-08-04 15:52:30', 1, 1);
INSERT INTO `user` VALUES (7, '关胜', '河东解良（今山西运城）人', '2020-08-05 17:04:08', 1, 1);
INSERT INTO `user` VALUES (8, '林冲', '东京（河南开封）人氏', '2020-07-27 17:14:32', 1, 1);
INSERT INTO `user` VALUES (9, '呼延灼', '并州太原（今属山西太原）', '2020-08-07 09:15:56', 1, 1);
INSERT INTO `user` VALUES (10, '花荣', '山东青州清风镇', '2020-08-07 09:17:17', 1, 1);
INSERT INTO `user` VALUES (11, '秦明', '山后开州', '2020-08-07 09:18:00', 1, 1);
INSERT INTO `user` VALUES (12, '柴进', '沧州人氏', '2020-08-07 09:18:42', 1, 1);
INSERT INTO `user` VALUES (13, '李应', '郓州人氏', '2020-08-07 09:19:13', 1, 1);
INSERT INTO `user` VALUES (14, '朱仝', '郓城县人氏', '2020-08-07 09:28:57', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
