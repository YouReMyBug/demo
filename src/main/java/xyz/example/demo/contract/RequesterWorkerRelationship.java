package xyz.example.demo.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.11.
 */
@SuppressWarnings("rawtypes")
public class RequesterWorkerRelationship extends Contract {
    public static final String BINARY = "60806040526000600f55600060105560405162001f1838038062001f188339810160409081528151602080840151928401516060850151608086015160a087015160c088015160e08901516101008a01516101208b015160008054600160a060020a03808d16600160a060020a03199283161790925560018054928e16928216929092179091556002805490911633179055968b018051999b90999681019895979496939592949193910191620000bc916003918b01906200034c565b5060005460028054604080517f846c68d3000000000000000000000000000000000000000000000000000000008152600160a060020a0392831660248201819052600482019283526003805460001960018216156101000201169590950460448301819052939095169463846c68d394939092918291606490910190859080156200018b5780601f106200015f576101008083540402835291602001916200018b565b820191906000526020600020905b8154815290600101906020018083116200016d57829003601f168201915b50509350505050602060405180830381600087803b158015620001ad57600080fd5b505af1158015620001c2573d6000803e3d6000fd5b505050506040513d6020811015620001d957600080fd5b50511515620001e757600080fd5b8651620001fc9060049060208a01906200034c565b50346005556006869055600785905560088490556000600955600a839055600b829055600c805460ff1916600117905580516200024190600d9060208401906200034c565b506000546040517fe4f1398b000000000000000000000000000000000000000000000000000000008152602060048201908152600380546002600019600183161561010002019091160460248401819052600160a060020a039094169363e4f1398b93919291829160449091019084908015620003025780601f10620002d65761010080835404028352916020019162000302565b820191906000526020600020905b815481529060010190602001808311620002e457829003601f168201915b505092505050600060405180830381600087803b1580156200032357600080fd5b505af115801562000338573d6000803e3d6000fd5b5050505050505050505050505050620003f1565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200038f57805160ff1916838001178555620003bf565b82800160010185558215620003bf579182015b82811115620003bf578251825591602001919060010190620003a2565b50620003cd929150620003d1565b5090565b620003ee91905b80821115620003cd5760008155600101620003d8565b90565b611b1780620004016000396000f30060806040526004361061007e5763ffffffff60e060020a600035041662b80fda811461009057806311bcb5e1146100b75780633c1be43f1461012457806341c0e1b51461017d57806356eee01a146101945780635e974e56146101af57806383b7b5dd14610319578063a28792ca146103ee578063bac64a2e1461043a575b34801561008a57600080fd5b50600080fd5b34801561009c57600080fd5b506100a5610573565b60408051918252519081900360200190f35b3480156100c357600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261011094369492936024939284019190819084018382808284375094975061057a9650505050505050565b604080519115158252519081900360200190f35b34801561013057600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101109436949293602493928401919081908401838280828437509497506106cf9650505050505050565b34801561018957600080fd5b50610192610831565b005b3480156101a057600080fd5b506101926004356024356108a8565b3480156101bb57600080fd5b506101c7600435611149565b60405180806020018060200180602001868152602001858152602001848103845289818151815260200191508051906020019080838360005b83811015610218578181015183820152602001610200565b50505050905090810190601f1680156102455780820380516001836020036101000a031916815260200191505b5084810383528851815288516020918201918a019080838360005b83811015610278578181015183820152602001610260565b50505050905090810190601f1680156102a55780820380516001836020036101000a031916815260200191505b50848103825287518152875160209182019189019080838360005b838110156102d85781810151838201526020016102c0565b50505050905090810190601f1680156103055780820380516001836020036101000a031916815260200191505b509850505050505050505060405180910390f35b34801561032557600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261019294369492936024939284019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506113b29650505050505050565b6040805160206004803580820135601f810184900484028501840190955284845261019294369492936024939284019190819084018382808284375094975061149b9650505050505050565b34801561044657600080fd5b5061044f6116fa565b60405180806020018b81526020018a815260200189815260200188815260200187815260200186815260200185815260200184600481111561048d57fe5b60ff1681526020018060200183810383528d818151815260200191508051906020019080838360005b838110156104ce5781810151838201526020016104b6565b50505050905090810190601f1680156104fb5780820380516001836020036101000a031916815260200191505b50838103825284518152845160209182019186019080838360005b8381101561052e578181015183820152602001610516565b50505050905090810190601f16801561055b5780820380516001836020036101000a031916815260200191505b509c5050505050505050505050505060405180910390f35b600e545b90565b600754600090421061058e575060006106ca565b6001600c5460ff1660048111156105a157fe5b146105ae575060006106ca565b600654333110156105c1575060006106ca565b600a54600080546040517f9113a9c4000000000000000000000000000000000000000000000000000000008152602060048201818152875160248401528751600160a060020a0390941694639113a9c4948994929384936044019290860191908190849084905b83811015610640578181015183820152602001610628565b50505050905090810190601f16801561066d5780820380516001836020036101000a031916815260200191505b5092505050602060405180830381600087803b15801561068c57600080fd5b505af11580156106a0573d6000803e3d6000fd5b505050506040513d60208110156106b657600080fd5b505110156106c6575060006106ca565b5060015b919050565b60038054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260009384936107689383018282801561075d5780601f106107325761010080835404028352916020019161075d565b820191906000526020600020905b81548152906001019060200180831161074057829003601f168201915b505050505084611878565b15610776576001915061082b565b5060005b600e5481101561082657610810600e8281548110151561079657fe5b90600052602060002090600602016001018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561075d5780601f106107325761010080835404028352916020019161075d565b1561081e576001915061082b565b60010161077a565b600091505b50919050565b600154600160a060020a0316331461084857600080fd5b610850611949565b506004600c5460ff16600481111561086457fe5b14156108a657600254604051600160a060020a0390911690303180156108fc02916000818181858888f193505050501580156108a4573d6000803e3d6000fd5b505b565b600154600090819081908190600160a060020a031633146108c857600080fd5b600e8054879081106108d657fe5b90600052602060002090600602016005015460001415156108f657600080fd5b84600e8781548110151561090657fe5b6000918252602090912060056006909202010155600e80548790811061092857fe5b6000918252602080832092546040517f9113a9c40000000000000000000000000000000000000000000000000000000081526004810192835260016006909402909401830180546002600019958216156101000295909501169390930460248501819052929750600160a060020a031692639113a9c4928892918291604490910190849080156109f95780601f106109ce576101008083540402835291602001916109f9565b820191906000526020600020905b8154815290600101906020018083116109dc57829003601f168201915b505092505050602060405180830381600087803b158015610a1957600080fd5b505af1158015610a2d573d6000803e3d6000fd5b505050506040513d6020811015610a4357600080fd5b505160065460085460055492955090935090811515610a5e57fe5b04905060058510158015610aef57506000809054906101000a9004600160a060020a0316600160a060020a031663f282f1506040518163ffffffff1660e060020a028152600401602060405180830381600087803b158015610abf57600080fd5b505af1158015610ad3573d6000803e3d6000fd5b505050506040513d6020811015610ae957600080fd5b50518310155b15610be7576000546040805160e060020a63e6f8f61b0281526001868101602483018190526004830193845288546002600019938216156101000293909301169190910460448301819052600160a060020a039094169363e6f8f61b938993909182916064019085908015610ba55780601f10610b7a57610100808354040283529160200191610ba5565b820191906000526020600020905b815481529060010190602001808311610b8857829003601f168201915b50509350505050600060405180830381600087803b158015610bc657600080fd5b505af1158015610bda573d6000803e3d6000fd5b5050509181019150610fea565b600585108015610c7757506000809054906101000a9004600160a060020a0316600160a060020a031663f282f1506040518163ffffffff1660e060020a028152600401602060405180830381600087803b158015610c4457600080fd5b505af1158015610c58573d6000803e3d6000fd5b505050506040513d6020811015610c6e57600080fd5b50516001018310155b15610d69576000546040805160e060020a63e6f8f61b028152600019808701602483018190526004830193845288546002600182161561010002909301169190910460448301819052600160a060020a039094169363e6f8f61b938993909182916064019085908015610d2b5780601f10610d0057610100808354040283529160200191610d2b565b820191906000526020600020905b815481529060010190602001808311610d0e57829003601f168201915b50509350505050600060405180830381600087803b158015610d4c57600080fd5b505af1158015610d60573d6000803e3d6000fd5b50505050610fea565b600585108015610df557506000809054906101000a9004600160a060020a0316600160a060020a031663f282f1506040518163ffffffff1660e060020a028152600401602060405180830381600087803b158015610dc657600080fd5b505af1158015610dda573d6000803e3d6000fd5b505050506040513d6020811015610df057600080fd5b505183145b15610e7a576000546040805160e060020a63e6f8f61b028152603c602482018190526004820192835287546002600019600183161561010002019091160460448301819052600160a060020a039094169363e6f8f61b938993909182916064019085908015610d2b5780601f10610d0057610100808354040283529160200191610d2b565b6000809054906101000a9004600160a060020a0316600160a060020a031663f282f1506040518163ffffffff1660e060020a028152600401602060405180830381600087803b158015610ecc57600080fd5b505af1158015610ee0573d6000803e3d6000fd5b505050506040513d6020811015610ef657600080fd5b5051831015610fea576000546040805160e060020a63e6f8f61b0281526001868101602483018190526004830193845288546002600019938216156101000293909301169190910460448301819052600160a060020a039094169363e6f8f61b938993909182916064019085908015610fb05780601f10610f8557610100808354040283529160200191610fb0565b820191906000526020600020905b815481529060010190602001808311610f9357829003601f168201915b50509350505050600060405180830381600087803b158015610fd157600080fd5b505af1158015610fe5573d6000803e3d6000fd5b505050505b600e805487908110610ff857fe5b60009182526020822060069091020154604051600160a060020a039091169184156108fc02918591818181858888f1935050505015801561103d573d6000803e3d6000fd5b506000546040517fcafa833000000000000000000000000000000000000000000000000000000000815260206004820190815286546002600019600183161561010002019091160460248301819052600160a060020a039093169263cafa833092889291829160440190849080156110f65780601f106110cb576101008083540402835291602001916110f6565b820191906000526020600020905b8154815290600101906020018083116110d957829003601f168201915b505092505050600060405180830381600087803b15801561111657600080fd5b505af115801561112a573d6000803e3d6000fd5b5050601080546001019055506111409050611949565b50505050505050565b6060806060600080600e8681548110151561116057fe5b9060005260206000209060060201600101600e8781548110151561118057fe5b9060005260206000209060060201600201600e888154811015156111a057fe5b9060005260206000209060060201600301600e898154811015156111c057fe5b906000526020600020906006020160040154600e8a8154811015156111e157fe5b600091825260209182902060056006909202010154855460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152919287919083018282801561127c5780601f106112515761010080835404028352916020019161127c565b820191906000526020600020905b81548152906001019060200180831161125f57829003601f168201915b5050875460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959a508994509250840190508282801561130a5780601f106112df5761010080835404028352916020019161130a565b820191906000526020600020905b8154815290600101906020018083116112ed57829003601f168201915b5050865460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959950889450925084019050828280156113985780601f1061136d57610100808354040283529160200191611398565b820191906000526020600020905b81548152906001019060200180831161137b57829003601f168201915b505050505092509450945094509450945091939590929450565b600154600090600160a060020a031633146113cc57600080fd5b60075442106113da57600080fd5b6113e384611a14565b90508061ffff14156113f457600080fd5b42600e8281548110151561140457fe5b90600052602060002090600602016004018190555082600e8281548110151561142957fe5b9060005260206000209060060201600201908051906020019061144d929190611a53565b5081600e8281548110151561145e57fe5b90600052602060002090600602016003019080519060200190611482929190611a53565b50600f80546001019055611494611949565b5050505050565b6114a4816106cf565b806114b557506114b38161057a565b155b156114bf57600080fd5b6006543410156114ce57600080fd5b6040805160c081018252338152602080820184815283518083018552600080825284860191909152845180840190955280855260608401949094526080830184905260a08301849052600e8054600181018083559190955283517fbb7b4a454dc3493923482f07822329ed19e8244eff582cc204f8554c3620c3fd6006909602958601805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0390921691909117815591518051919592936115b2937fbb7b4a454dc3493923482f07822329ed19e8244eff582cc204f8554c3620c3fe0192910190611a53565b50604082015180516115ce916002840191602090910190611a53565b50606082015180516115ea916003840191602090910190611a53565b50608082015160048083019190915560a090920151600590910155600080546040517f30faf1f00000000000000000000000000000000000000000000000000000000081526020938101848152865160248301528651600160a060020a0390931695506330faf1f09487949193849360440192918601918190849084905b83811015611680578181015183820152602001611668565b50505050905090810190601f1680156116ad5780820380516001836020036101000a031916815260200191505b5092505050600060405180830381600087803b1580156116cc57600080fd5b505af11580156116e0573d6000803e3d6000fd5b5050600980546001019055506116f69050611949565b5050565b60606000806000806000806000806060611712611949565b50600554600654600754600854600954600a54600b54600c546004805460408051602060026101006001861615026000190190941693909304601f8101849004840282018401909252818152929a9998979695949360ff1692600d9290918c918301828280156117c35780601f10611798576101008083540402835291602001916117c3565b820191906000526020600020905b8154815290600101906020018083116117a657829003601f168201915b5050845460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959f50869450925084019050828280156118515780601f1061182657610100808354040283529160200191611851565b820191906000526020600020905b81548152906001019060200180831161183457829003601f168201915b50505050509050995099509950995099509950995099509950995090919293949596979899565b815181516000918491849190849082111561189257825191505b5060005b818110156119375782818151811015156118ac57fe5b90602001015160f860020a900460f860020a027effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff191684828151811015156118ef57fe5b60209101015160f860020a90819004027fff00000000000000000000000000000000000000000000000000000000000000161461192f576000945061193f565b600101611896565b825184511494505b5050505092915050565b600c805460ff1916905560085460095460009111801561196b57506007544211155b1561197e57600c805460ff191660011790555b60085460095414801561199357506007544211155b156119a657600c805460ff191660021790555b601054600f541180156119bb57506007544210155b156119ce57600c805460ff191660031790555b601054600f541480156119e357506007544210155b806119ff5750601054600f541480156119ff5750600854601054145b1561057757600c805460ff1916600417905590565b6000805b600e54811015611a4957611a34600e8281548110151561079657fe5b15611a415780915061082b565b600101611a18565b5061ffff92915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10611a9457805160ff1916838001178555611ac1565b82800160010185558215611ac1579182015b82811115611ac1578251825591602001919060010190611aa6565b50611acd929150611ad1565b5090565b61057791905b80821115611acd5760008155600101611ad75600a165627a7a72305820b9a14b5705532a9889237d55fd48023e645980ee66821489eb659133e82d18680029";

    public static final String FUNC_GETSOLUTIONLENGTH = "getSolutionLength";

    public static final String FUNC_CHECKWORKER = "checkWorker";

    public static final String FUNC_ISRECEIVE = "isReceive";

    public static final String FUNC_KILL = "kill";

    public static final String FUNC_EVALUATESOLUTION = "evaluateSolution";

    public static final String FUNC_GETSOLUTION = "getSolution";

    public static final String FUNC_SUBMITSOLUTION = "submitSolution";

    public static final String FUNC_RECEIVETASK = "receiveTask";

    public static final String FUNC_GETTASKINFO = "getTaskInfo";

    @Deprecated
    protected RequesterWorkerRelationship(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected RequesterWorkerRelationship(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected RequesterWorkerRelationship(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected RequesterWorkerRelationship(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> getSolutionLength() {
        final Function function = new Function(
                FUNC_GETSOLUTIONLENGTH, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> checkWorker(String workerName) {
        final Function function = new Function(
                FUNC_CHECKWORKER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> isReceive(String workerName) {
        final Function function = new Function(
                FUNC_ISRECEIVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> kill() {
        final Function function = new Function(
                FUNC_KILL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> evaluateSolution(BigInteger id, BigInteger level) {
        final Function function = new Function(
                FUNC_EVALUATESOLUTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id), 
                new org.web3j.abi.datatypes.generated.Uint256(level)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getSolution(BigInteger i) {
        final Function function = new Function(
                FUNC_GETSOLUTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(i)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitSolution(String workerName, String solution, String pointer) {
        final Function function = new Function(
                FUNC_SUBMITSOLUTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName), 
                new org.web3j.abi.datatypes.Utf8String(solution), 
                new org.web3j.abi.datatypes.Utf8String(pointer)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> receiveTask(String workerName, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_RECEIVETASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<TransactionReceipt> getTaskInfo() {
        final Function function = new Function(
                FUNC_GETTASKINFO, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static RequesterWorkerRelationship load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new RequesterWorkerRelationship(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static RequesterWorkerRelationship load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new RequesterWorkerRelationship(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static RequesterWorkerRelationship load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new RequesterWorkerRelationship(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RequesterWorkerRelationship load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new RequesterWorkerRelationship(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<RequesterWorkerRelationship> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, BigInteger initialWeiValue, String regAddr, String _gmAddr, String _ownerName, String desc, BigInteger deposit, BigInteger deadline, BigInteger maxNum, BigInteger minReputation, BigInteger ttype, String pointer) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr), 
                new org.web3j.abi.datatypes.Address(160, _gmAddr), 
                new org.web3j.abi.datatypes.Utf8String(_ownerName), 
                new org.web3j.abi.datatypes.Utf8String(desc), 
                new org.web3j.abi.datatypes.generated.Uint256(deposit), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint256(maxNum), 
                new org.web3j.abi.datatypes.generated.Uint256(minReputation), 
                new org.web3j.abi.datatypes.generated.Uint256(ttype), 
                new org.web3j.abi.datatypes.Utf8String(pointer)));
        return deployRemoteCall(RequesterWorkerRelationship.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor, initialWeiValue);
    }

    public static RemoteCall<RequesterWorkerRelationship> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger initialWeiValue, String regAddr, String _gmAddr, String _ownerName, String desc, BigInteger deposit, BigInteger deadline, BigInteger maxNum, BigInteger minReputation, BigInteger ttype, String pointer) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr), 
                new org.web3j.abi.datatypes.Address(160, _gmAddr), 
                new org.web3j.abi.datatypes.Utf8String(_ownerName), 
                new org.web3j.abi.datatypes.Utf8String(desc), 
                new org.web3j.abi.datatypes.generated.Uint256(deposit), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint256(maxNum), 
                new org.web3j.abi.datatypes.generated.Uint256(minReputation), 
                new org.web3j.abi.datatypes.generated.Uint256(ttype), 
                new org.web3j.abi.datatypes.Utf8String(pointer)));
        return deployRemoteCall(RequesterWorkerRelationship.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor, initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<RequesterWorkerRelationship> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, String regAddr, String _gmAddr, String _ownerName, String desc, BigInteger deposit, BigInteger deadline, BigInteger maxNum, BigInteger minReputation, BigInteger ttype, String pointer) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr), 
                new org.web3j.abi.datatypes.Address(160, _gmAddr), 
                new org.web3j.abi.datatypes.Utf8String(_ownerName), 
                new org.web3j.abi.datatypes.Utf8String(desc), 
                new org.web3j.abi.datatypes.generated.Uint256(deposit), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint256(maxNum), 
                new org.web3j.abi.datatypes.generated.Uint256(minReputation), 
                new org.web3j.abi.datatypes.generated.Uint256(ttype), 
                new org.web3j.abi.datatypes.Utf8String(pointer)));
        return deployRemoteCall(RequesterWorkerRelationship.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<RequesterWorkerRelationship> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, String regAddr, String _gmAddr, String _ownerName, String desc, BigInteger deposit, BigInteger deadline, BigInteger maxNum, BigInteger minReputation, BigInteger ttype, String pointer) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr), 
                new org.web3j.abi.datatypes.Address(160, _gmAddr), 
                new org.web3j.abi.datatypes.Utf8String(_ownerName), 
                new org.web3j.abi.datatypes.Utf8String(desc), 
                new org.web3j.abi.datatypes.generated.Uint256(deposit), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint256(maxNum), 
                new org.web3j.abi.datatypes.generated.Uint256(minReputation), 
                new org.web3j.abi.datatypes.generated.Uint256(ttype), 
                new org.web3j.abi.datatypes.Utf8String(pointer)));
        return deployRemoteCall(RequesterWorkerRelationship.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }
}