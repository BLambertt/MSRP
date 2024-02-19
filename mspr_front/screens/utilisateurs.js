import {useEffect, useState} from "react";
import {getUtilisateurs} from "../Api"
import {FlatList,Text,View} from "react-native";
const UtilisateursList = () => {
    const [utilisateurs, setUtilisateurs] = useState([])

    useEffect(() => {
        setUtilisateurs(getUtilisateurs());
    }, []);

    return (
        <View>
            <Text>Utilisateurs List</Text>
            <FlatList
                data={utilisateurs}
                keyExtractor={(item) => item.id.toString()}
                renderItem={({ item }) => (
                    <View>
                        <Text>{item.name}</Text>
                    </View>
                )}
            />
        </View>
    );
}

export default UtilisateursList;