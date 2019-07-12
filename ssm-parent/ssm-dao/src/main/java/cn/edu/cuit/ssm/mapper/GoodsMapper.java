package cn.edu.cuit.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.edu.cuit.ssm.entity.Goods;

public interface GoodsMapper {
    @Select("select goods_id as id,goods_name as name,goods_price as price,goods_num as num,goods_img as img ,goods_type as type from goods")
	List<Goods> findAll();

}
