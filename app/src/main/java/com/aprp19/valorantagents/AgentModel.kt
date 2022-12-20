package com.aprp19.valorantagents

data class AgentModel(
    var agent_name: String = "",
    var agent_detail: String = "",
    var agent_image: Int = 0,
    var agent_role_image: Int = 0,
    var agent_role: String = "",
    var agent_skill_1_image: Int = 0,
    var agent_skill_1_name: String= "",
    var agent_skill_1_detail: String= "",
    var agent_skill_2_image: Int = 0,
    var agent_skill_2_name: String= "",
    var agent_skill_2_detail: String= "",
    var agent_skill_3_image: Int = 0,
    var agent_skill_3_name: String= "",
    var agent_skill_3_detail: String= "",
    var agent_skill_4_image: Int = 0,
    var agent_skill_4_name: String= "",
    var agent_skill_4_detail: String= "",
)
