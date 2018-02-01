package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {
	@Select("select * from notice")
	public List<Notice> findAll();

	public long count();
	
	public List<Notice> findList(@Param("page")Integer page,@Param("rows")Integer rows);
	
}
