package com.aprp19.valorantagents

import java.util.*

object AgentData {
    private val agentName = arrayOf(
        "Brimstone",
        "Phoenix",
        "Sage",
        "Sova",
        "Viper",
        "Cypher",
        "Reyna",
        "Killjoy",
        "Breach",
        "Omen"
    )

    private val agentDetails = arrayOf(
        "Joining from the USA, Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and from a distance makes him an unmatched boots-on-the-ground commander.",
        "Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms.",
        "The stronghold of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.",
        "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.",
        "The American chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and cripple the enemy's vision. If the toxins don't kill her prey, her mind games surely will.",
        "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.",
        "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.",
        "The genius of Germany. Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots' debuff will help make short work of them.",
        "Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.",
        "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next."
    )

    private val agentImages = intArrayOf(
        R.drawable.brimstone ,
        R.drawable.phoenix ,
        R.drawable.sage,
        R.drawable.sova ,
        R.drawable.viper,
        R.drawable.cypher ,
        R.drawable.reyna ,
        R.drawable.killjoy ,
        R.drawable.breach ,
        R.drawable.omen
    )

    private val agentRoleImage = intArrayOf(
        R.drawable.role_controller,
        R.drawable.role_duelist,
        R.drawable.role_sentinel,
        R.drawable.role_initiator,
        R.drawable.role_controller,
        R.drawable.role_sentinel,
        R.drawable.role_duelist,
        R.drawable.role_sentinel,
        R.drawable.role_initiator,
        R.drawable.role_controller,
    )

    private val agentRole = arrayOf(
        "Controller",
        "Duelist",
        "Sentinel",
        "Initiator",
        "Controller",
        "Sentinel",
        "Duelist",
        "Sentinel",
        "Initiator",
        "Controller"
    )

    private val agentSkill1Image = intArrayOf(
        R.drawable.brimstone_q,
        R.drawable.phoenix_q,
        R.drawable.sage_q,
        R.drawable.sova_q,
        R.drawable.viper_q,
        R.drawable.cypher_q,
        R.drawable.reyna_q,
        R.drawable.killjoy_q,
        R.drawable.breach_q,
        R.drawable.omen_q,
    )
    private val agentSkill1Name = arrayOf(
        "Q - INCENDIARY",
        "Q - CURVEBALL",
        "Q - SLOW ORB",
        "Q - SHOCK BOLT",
        "Q - POISON CLOUD",
        "Q - CYBER CAGE",
        "Q - DEVOUR",
        "Q - ALARMBOT",
        "Q - FLASHPOINT",
        "Q - PARANOIA"
    )
    private val agentSkill1Detail = arrayOf(
        "EQUIP an incendiary grenade launcher. FIRE to launch a grenade that detonates as it comes to a rest on the floor, creating a lingering fire zone that damages players within the zone.",
        "EQUIP a flare orb that takes a curving path and detonates shortly after throwing. FIRE to curve the flare orb to the left, detonating and blinding any player who sees the orb. ALTERNATE FIRE to curve the flare orb to the right.",
        "EQUIP a slowing orb. FIRE to throw a slowing orb forward that detonates upon landing, creating a lingering field that slows players caught inside of it.",
        "EQUIP a bow with a shock bolt. FIRE to send the explosive forward, detonating upon collision and damaging players nearby. HOLD FIRE to extend the range of the projectile. ALTERNATE FIRE to add up to two bounces to this arrow.",
        "EQUIP a gas emitter. FIRE to throw the emitter that perpetually remains throughout the round. RE-USE the ability to create a toxic gas cloud at the cost of fuel. This ability can be RE-USED more than once and can be picked up to be REDEPLOYED.",
        "INSTANTLY toss the cyber cage in front of Cypher. Activate to create a zone that blocks vision and slows enemies who pass through it.",
        "INSTANTLY consume a nearby soul orb, rapidly healing for a short duration. Health gained through this skill exceeding 100 will decay over time. If EMPRESS is active, this skill will automatically cast and not consume the orb.",
        "EQUIP a covert Alarmbot. FIRE to deploy a bot that hunts down enemies that get in range. After reaching its target, the bot explodes, applying Vulernable. HOLD EQUIP to recall a deployed bot.",
        "EQUIP a blinding charge. FIRE the charge to set fast-acting burst through the wall. The charge detonates to blind all players looking at it.",
        "INSTANTLY fire a shadow projectile forward, briefly reducing the vision range of all players it touches. This projectile can pass straight through walls."
    )

    private val agentSkill2Image = intArrayOf(
        R.drawable.brimstone_e,
        R.drawable.phoenix_e,
        R.drawable.sage_e,
        R.drawable.sova_e,
        R.drawable.viper_e,
        R.drawable.cypher_e,
        R.drawable.reyna_e,
        R.drawable.killjoy_e,
        R.drawable.breach_e,
        R.drawable.omen_e,
    )
    private val agentSkill2Name = arrayOf(
        "E - SKY SMOKE",
        "E - HOT HANDS",
        "E - HEALING ORB",
        "E - RECON BOLT",
        "E - TOXIC SCREEN",
        "E - SPYCAM",
        "E - DISMISS",
        "E - TURRET",
        "E - FAULT LINE",
        "E - DARK COVER"
    )
    private val agentSkill2Detail = arrayOf(
        "EQUIP a tactical map. FIRE to set locations where Brimstone’s smoke clouds will land. ALTERNATE FIRE to confirm, launching long-lasting smoke clouds that block vision in the selected area.",
        "EQUIP a fireball. FIRE to throw a fireball that explodes after a set amount of time or upon hitting the ground, creating a lingering fire zone that damages enemies.",
        "EQUIP a healing orb. FIRE with your crosshairs over a damaged ally to activate a heal-over-time on them. ALT FIRE while Sage is damaged to activate a self heal-over-time.",
        "EQUIP a bow with a recon bolt. FIRE to send the recon bolt forward, activating upon collision and revealing the location of nearby enemies caught in the line of sight of the bolt. HOLD FIRE to extend the range of the projectile. ALTERNATE FIRE to add up to two bounces to this arrow.",
        "EQUIP a gas emitter launcher. FIRE to deploy a long line of gas emitters. RE-USE the ability to create a tall wall of toxic gas at the cost of fuel. This ability can be RE-USED more than once.",
        "EQUIP a spycam. FIRE to place the spycam at the targeted location. RE-USE this ability to take control of the camera’s view. While in control of the camera, FIRE to shoot a marking dart. This dart will reveal the location of any player struck by the dart.",
        "INSTANTLY consume a nearby soul orb, becoming intangible for a short duration. If EMPRESS is active, also become invisible.",
        "EQUIP a Turret. FIRE to deploy a turret that fires at enemies in a 180 degree cone. HOLD EQUIP to recall the deployed turret.",
        "EQUIP a seismic blast. HOLD FIRE to increase the distance. RELEASE to set off the quake, dazing all players in its zone and in a line up to the zone.",
        "EQUIP a shadow orb and see its range indicator. FIRE to throw the shadow orb to the marked location, creating a long-lasting shadow sphere that blocks vision. HOLD ALTERNATE FIRE while targeting to move the marker further away. HOLD the ability key with targeting to move the marker closer."
    )

    private val agentSkill3Image = intArrayOf(
        R.drawable.brimstone_c,
        R.drawable.phoenix_c,
        R.drawable.sage_c,
        R.drawable.sova_c,
        R.drawable.viper_c,
        R.drawable.cypher_c,
        R.drawable.reyna_c,
        R.drawable.killjoy_c,
        R.drawable.breach_c,
        R.drawable.omen_c,
    )
    private val agentSkill3Name = arrayOf(
        "C - STIM BEACON",
        "C - BLAZE",
        "C - BARRIER ORB",
        "C - OWL DRONE",
        "C - SNAKE BITE",
        "C - TRAPWIRE",
        "C - LEER",
        "C - NANOSWARM",
        "C - AFTERSHOCK",
        "C - SHROUDED STEP"
    )
    private val agentSkill3Detail = arrayOf(
        "EQUIP a stim beacon. FIRE to toss the stim beacon in front of Brimstone. Upon landing, the stim beacon will create a field that grants players RapidFire.",
        "EQUIP a flame wall. FIRE to create a line of flame that moves forward, creating a wall of fire that blocks vision and damages players passing through it. HOLD FIRE to bend the wall in the direction of your crosshair.",
        "EQUIP a barrier orb. FIRE places a solid wall. ALT FIRE rotates the targeter.",
        "EQUIP an owl drone. FIRE to deploy and take control of movement of the drone. While in control of the drone, FIRE to shoot a marking dart. This dart will reveal the location of any player struck by the dart.",
        "EQUIP a chemical launcher. FIRE to launch a canister that shatters upon hitting the floor, creating a lingering chemical zone that damages and slows enemies.",
        "EQUIP a trapwire. FIRE to place a destructible and covert tripwire at the targeted location creating a line that spans between the placed location and the wall opposite. Enemy players who cross a tripwire will be tethered, revealed, and dazed after a short period if they do not destroy the device in time. This ability can be picked up to be REDEPLOYED.",
        "EQUIP an ethereal destructible eye. ACTIVATE to cast the eye a short distance forward. The eye will Nearsight all enemies who look at it.",
        "EQUIP a Nanoswarm grenade. FIRE to throw the grenade. Upon landing, the Nanoswarm goes covert. ACTIVATE the Nanoswarm to deploy a damaging swarm of nanobots.",
        "EQUIP a fusion charge. FIRE the charge to set a slow-acting burst through the wall. The burst does heavy damage to anyone caught in its area.",
        "EQUIP a shadow walk ability and see its range indicator. FIRE to begin a brief channel, then teleport to the marked location."
    )

    private val agentSkill4Image = intArrayOf(
        R.drawable.brimstone_x,
        R.drawable.phoenix_x,
        R.drawable.sage_x,
        R.drawable.sova_x,
        R.drawable.viper_x,
        R.drawable.cypher_x,
        R.drawable.reyna_x,
        R.drawable.killjoy_x,
        R.drawable.breach_x,
        R.drawable.omen_x,
    )
    private val agentSkill4Name = arrayOf(
        "X - ORBITAL STRIKE",
        "X - RUN IT BACK",
        "X - RESURRECTION",
        "X - HUNTER’S FURY",
        "X - VIPER’S PIT",
        "X - NEURAL THEFT",
        "X - EMPRESS",
        "X - LOCKDOWN",
        "X - ROLLING THUNDER",
        "X - FROM THE SHADOWS"
    )
    private val agentSkill4Detail = arrayOf(
        "EQUIP a tactical map. FIRE to launch a lingering orbital strike laser at the selected location, dealing high damage-over-time to players caught in the selected area.",
        "INSTANTLY place a marker at Phoenix’s location. While this ability is active, dying or allowing the timer to expire will end this ability and bring Phoenix back to this location with full health.",
        "EQUIP a resurrection ability. FIRE with your crosshairs placed over a dead ally to begin resurrecting them. After a brief channel, the ally will be brought back to life with full health.",
        "EQUIP a bow with three long-range wall-piercing energy blasts. FIRE to release an energy blast in a line in front of Sova, dealing damage and revealing the location of enemies caught in the line. This ability can be RE-USED up to two more times while the ability timer is active.",
        "EQUIP a chemical sprayer. FIRE to spray a chemical cloud in all directions around Viper, creating a large cloud that reduces the vision range and maximum health of players inside of it.",
        "INSTANTLY use on a dead enemy player in your crosshairs to reveal the location of all living enemy players.",
        "INSTANTLY enter a frenzy, increasing firing speed, equip and reload speed dramatically. Scoring a kill renews the duration.",
        "EQUIP the Lockdown device. FIRE to deploy the device. After a long windup, the device Detains all enemies caught in the radius. The device can be destroyed by enemies.",
        "EQUIP a seismic charge. FIRE to send a cascading quake through all terrain in a large cone. The quake dazes and knocks up anyone caught in it.",
        "EQUIP a tactical map. FIRE to begin teleporting to the selected location. While teleporting, Omen will appear as a Shade that can be destroyed by an enemy to cancel his teleport."
    )

    val agentItem: ArrayList<AgentModel>
    get() {
        val list = arrayListOf<AgentModel>()
        for (position in agentName.indices){
            val item = AgentModel()
            item.agent_name = agentName[position]
            item.agent_detail = agentDetails[position]
            item.agent_image = agentImages[position]
            item.agent_role_image = agentRoleImage[position]
            item.agent_role = agentRole[position]
            item.agent_skill_1_image = agentSkill1Image[position]
            item.agent_skill_1_name = agentSkill1Name[position]
            item.agent_skill_1_detail = agentSkill1Detail[position]
            item.agent_skill_2_image = agentSkill2Image[position]
            item.agent_skill_2_name = agentSkill2Name[position]
            item.agent_skill_2_detail = agentSkill2Detail[position]
            item.agent_skill_3_image = agentSkill3Image[position]
            item.agent_skill_3_name = agentSkill3Name[position]
            item.agent_skill_3_detail = agentSkill3Detail[position]
            item.agent_skill_4_image = agentSkill4Image[position]
            item.agent_skill_4_name = agentSkill4Name[position]
            item.agent_skill_4_detail = agentSkill4Detail[position]
            list.add(item)
        }
        return list
    }
}