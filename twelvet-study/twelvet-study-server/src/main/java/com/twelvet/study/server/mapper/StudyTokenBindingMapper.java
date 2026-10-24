package com.twelvet.study.server.mapper;

import com.twelvet.study.api.domain.StudyTokenBinding;
import org.apache.ibatis.annotations.Param;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序令牌绑定数据层
 */
public interface StudyTokenBindingMapper {

	/**
	 * 根据后台用户ID查询绑定记录
	 * @param userId 后台用户ID
	 * @return 绑定记录
	 */
	StudyTokenBinding selectBindingByUserId(@Param("userId") Long userId);

	/**
	 * 新增绑定记录
	 * @param binding 绑定记录
	 * @return 结果
	 */
	int insertBinding(StudyTokenBinding binding);

	/**
	 * 按后台用户ID修改绑定记录
	 * @param binding 绑定记录，userId 必填
	 * @return 结果
	 */
	int updateBindingByUserId(StudyTokenBinding binding);

	/**
	 * 更新指定后台用户的令牌状态
	 * @param userId 后台用户ID
	 * @param tokenStatus 令牌状态：0-有效 1-失效
	 * @return 结果
	 */
	int updateTokenStatusByUserId(@Param("userId") Long userId, @Param("tokenStatus") Integer tokenStatus);

	/**
	 * 按后台用户ID删除绑定记录
	 * @param userId 后台用户ID
	 * @return 结果
	 */
	int deleteBindingByUserId(@Param("userId") Long userId);

}
